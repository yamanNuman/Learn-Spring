import { useState } from 'react';
import './Counter.css'
import CounterButton from './CounterButton';

export default function Counter(){
    const [count,setCount] = useState(0);

    function increment(by){
        setCount(count +  by);
    }

    function decrement(by){
        setCount(count - by);
    }

    function resetCounter(){
        setCount(0);    
    }
    return (
        <>
            <span className='count'>{count}</span>
            <CounterButton by={1} incrementMethod={increment} decrementMethod={decrement}/>
            <CounterButton by={2} incrementMethod={increment} decrementMethod={decrement}/>
            <CounterButton by={5} incrementMethod={increment} decrementMethod={decrement}/>
            <button className='resetButton' onClick={resetCounter}>Reset</button>
        </>
    )
}

