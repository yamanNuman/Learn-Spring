import LoginComponent from "./LoginComponent";
import "./TodoApp.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import LogoutComponent from "./LogoutComponent";
import FooterComponent from "./FooterComponent";
import HeaderComponent from "./HeaderComponent";
import ListTodosComponent from "./ListTodosComponent";
import ErrorComponent from "./ErrorComponent";
import WelcomeComponent from "./WelcomeComponent";
import AuthProvider from "./security/AuthContext";

export default function TodoApp() {
  return (
    <div className="TodoApp">
      <AuthProvider>
        <BrowserRouter>
          <HeaderComponent />
          <Routes>
            <Route path="/" element={<LoginComponent />}></Route>
            <Route path="/login" element={<LoginComponent />}></Route>
            <Route
              path="/welcome/:username"
              element={<WelcomeComponent />}
            ></Route>
            <Route path="/todos" element={<ListTodosComponent />} />
            <Route path="/logout" element={<LogoutComponent />} />
            <Route path="*" element={<ErrorComponent />}></Route>
          </Routes>
          <FooterComponent />
        </BrowserRouter>
      </AuthProvider>
    </div>
  );
}
