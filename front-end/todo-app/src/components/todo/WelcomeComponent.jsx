import { useState } from "react";
import { Link, useParams } from "react-router-dom";
import {
  retrieveHelloWorldBean,
  retrieveHelloWorldBeanPathVariable,
} from "./api/HelloWorldApiService";

function WelcomeComponent() {
  const { username } = useParams();
  const [message, setMessage] = useState();

  function callHelloWorldRestApi() {
    // axios
    //   .get("http://localhost:8080/hello-world")
    //   .then((response) => successfulResponse(response))
    //   .catch((error) => errorResponse(error))
    //   .finally(() => console.log("cleanup"));

    // retrieveHelloWorldBean()
    //   .then((response) => successfulResponse(response))
    //   .catch((error) => errorResponse(error))
    //   .finally(() => console.log("cleanup"));

    retrieveHelloWorldBeanPathVariable("Javi")
      .then((response) => successfulResponse(response))
      .catch((error) => errorResponse(error))
      .finally(() => console.log());
  }

  function successfulResponse(response) {
    setMessage(response.data.message);
  }
  function errorResponse(error) {
    console.log(error);
  }
  return (
    <div className="WelcomeComponent">
      <h1>Welcome {username}</h1>
      <div>
        Manage your todos - <Link to="/todos">Go here</Link>
      </div>
      <div>
        <button className="btn btn-success m-5" onClick={callHelloWorldRestApi}>
          Call Hello World REST API
        </button>
      </div>
      <div className="text-info">{message}</div>
    </div>
  );
}

export default WelcomeComponent;
