import { createContext, useContext, useState } from "react";
import { executeBasicAuthenticationService } from "../api/HelloWorldApiService";

//Create Context
export const AuthContext = createContext();

export const useAuth = () => useContext(AuthContext);


export default function AuthProvider({children}) {
    //Put some state in context
const [isAuthenticated,setAuthenticated] = useState(false);
const [username,setUsername] = useState(null);
const [token,setToken] = useState(null);

//Share the created context with other components
async function login(username,password) {
    const baToken = 'Basic ' + window.btoa(username + ":" + password);
    const response = await executeBasicAuthenticationService(baToken)
    try{
        if(response.status == 200) {
            setAuthenticated(true);
            setUsername(username);
            setToken(baToken);
            return true;
        } else {
            setAuthenticated(false);
            setUsername(null);
            setToken(null);
            return false;
        }
    } catch(error) {
        setAuthenticated(false);
        setUsername(null);
        setToken(null);
        return false;
    }
}

function logout() {
    setAuthenticated(false);
    setToken(null);
    setUsername(null);
}
    return (
        <AuthContext.Provider value={{isAuthenticated,login,logout,username}}>
            {children}
        </AuthContext.Provider>
    )
}