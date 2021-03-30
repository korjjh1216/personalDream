import React, { useState } from 'react';
import { Link } from "react-router-dom";
import axios from 'axios'

const QnABoardAdd =(props) =>{
    const [inputs, setInputs] = useState({
                title: "",
                content: "",
                userName: "",
            });

    const { title, content, userName} = inputs;

    const handleChange = (e) => {
        const { value, name } = e.target;
        setInputs({
            ...inputs,
            [name]: value,
        });
    };
    const handleSubmit = (e) => {
        e.preventDefault();
        axios
            .post("http://localhost:8080/qna", {
                title,
                userName,
                content,
            })
            .then((res) => {
                console.log(res);
                props.history.push(`/List`)
            })
            .catch((err) => console.log(err));
    };    

    
        return(
        <form onSubmit={handleSubmit} method="post" align = "center">
                <h2> 게시글을 등록해주세요 </h2>
                제   목 :  <input type="text" onChange={handleChange} name="title" value={title}/><br/><br/>
                작 성 자:  <input type="text" onChange={handleChange} name="userName" value={userName}/><br/><br/>
                본   문 :  <textarea row = "5" onChange={handleChange} name="content" value={content}/><br/>
            
                <button type="submit">등록하기</button>
            

        </form>
        )
  
};


export default QnABoardAdd