import { useState } from "react";
import {
  deleteTodoApi,
  retrieveAllTodosForUsername,
} from "./api/TodoApiService";
import { useEffect } from "react";
import { useAuth } from "./security/AuthContext";
import { useNavigate } from "react-router-dom";

function ListTodosComponent() {
  const authContext = useAuth();
  const username = authContext.username;
  const [todos, setTodos] = useState([]);
  const [message, setMessage] = useState(null);
  const navigate = useNavigate();

  useEffect(() => refreshTodos, []);

  function refreshTodos() {
    retrieveAllTodosForUsername(username)
      .then((response) => {
        setTodos(response.data);
      })
      .catch((error) => console.log(error));
  }

  function deleteTodo(id) {
    deleteTodoApi(username, id)
      .then((response) => {
        refreshTodos(response);
        setMessage(`Delete ${id}`);
      })
      .catch((err) => console.log(err));
  }

  function updateTodo(id) {
    navigate(`/todos/${id}`);
    console.log(id);
  }

  function addNewTodo() {
    navigate(`/todo/-1`);
  }
  return (
    <div className="container">
      <h1>Things you want to do</h1>
      {message && <div className="alert alert-warning">{message}</div>}
      <div>
        <table className="table">
          <thead>
            <tr>
              <th>Description</th>
              <th>Is Done ?</th>
              <th>Target Date</th>
              <th></th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            {todos.map((todo) => (
              <tr key={todo.id}>
                <td>{todo.description}</td>
                <td>{todo.done.toString()}</td>
                <td>{todo.targetDate.toString()}</td>
                <td>
                  <button
                    className="btn btn-warning"
                    onClick={() => deleteTodo(todo.id)}
                  >
                    Delete
                  </button>
                </td>
                <td>
                  <button
                    className="btn btn-danger"
                    onClick={() => updateTodo(todo.id)}
                  >
                    Update
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
        <div>
          <button className="btn btn-success m-3" onClick={addNewTodo}>
            Add New Todo
          </button>
        </div>
      </div>
    </div>
  );
}
export default ListTodosComponent;
