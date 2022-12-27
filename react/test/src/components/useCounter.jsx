import React from "react";
import { useState } from "react";

// Custom hook
function useCounter(initVal){

    // count 함수는 0부터 시작 , 언제나 count는 0으로 유지  
    const [count, setCount] = useState(initVal)

    const incrementCount = () => setCount((count) => count + 1)

    const decrementCount = () => setCount((count) => Math.max(count - 1, 0))

    return [count, incrementCount, decrementCount]

}
export default useCounter;