import React, { useState, useEffect } from 'react';
import CheckLogin from '../component/CheckLogin'
import { Link } from 'react-router-dom'

const Home = () => {
    const style ={width: 150, margin: "0 auto"}
    const [isloggedin, setIsLoggedIn] = useState({
        isloggedin: false,
    });
    console.log(isloggedin);

    useEffect(() => {
        if (localStorage.getItem('token')) {
            setIsLoggedIn({
                isloggedin: true,
            });
        } else {
            setIsLoggedIn();
        }
    }, []);


    return(<>
    <div style = {style}><h1>Home</h1>
	<Link to ={"/UserLogin"}>게시판</Link><br/>
    <Link to = {"UserList"}>회원목록</Link><br/>
    <CheckLogin isloggedin={isloggedin} />
    </div>
    </>)
}

export default Home