import { createContext, useContext, useState } from "react";

//Create Context
export const AuthContext = createContext();

export const useAuth = () => useContext(AuthContext);


export default function AuthProvider({children}) {
    //Put some state in context
const [number,setNumber] = useState(0);
const [isAuthenticated,setAuthenticated] = useState(false);

//Share the created context with other components
function login(username,password) {
    if(username === 'in28minutes' && password === 'dummy') {
        setAuthenticated(true);
        return true;
    } else {
        setAuthenticated(false);
        return false;
    }
}

function logout() {
    setAuthenticated(false);
}
 
    const valueToBeShared = {number,isAuthenticated,setNumber,setAuthenticated,login,logout}

    return (
        <AuthContext.Provider value={valueToBeShared}>
            {children}
        </AuthContext.Provider>
    )
}