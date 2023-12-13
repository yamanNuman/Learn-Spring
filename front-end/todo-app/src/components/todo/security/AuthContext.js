import { createContext, useContext, useState } from "react";

//Create Context
export const AuthContext = createContext();

export const useAuth = () => useContext(AuthContext);


export default function AuthProvider({children}) {
    //Put some state in context
const [isAuthenticated,setAuthenticated] = useState(false);
const [username,setUsername] = useState(null);

//Share the created context with other components
function login(username,password) {
    if(username === 'in28minutes' && password === 'dummy') {
        setAuthenticated(true);
        setUsername(username);
        return true;
    } else {
        setAuthenticated(false);
        setUsername(null);
        return false;
    }
}

function logout() {
    setAuthenticated(false);
}
    return (
        <AuthContext.Provider value={{isAuthenticated,login,logout,username}}>
            {children}
        </AuthContext.Provider>
    )
}