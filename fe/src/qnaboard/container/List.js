import { Link } from 'react-router-dom'
import React from 'react'
import QnABoardList from '../component/QnABoardList'


const List = () => (
    <>
        <h1>QnABoardList Page</h1>
        <QnABoardList/>
        <button>
            <Link to ={"/Create"}>등록</Link>
        </button>
    </>
)

export default List