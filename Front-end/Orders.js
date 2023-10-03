import React, { useEffect, useState } from 'react'
import axios from "axios"


export default function Orders() {

    const [orders,setorders]=useState([])

    useEffect(()=>{
        loadOrders();
    
    },[]);

        //   console.log("Orders History")
        const loadOrders=async()=>{
            const result=await axios.get("http://localhost:8080/GetAllOrders")
           setorders(result.data);
        };

    

  return (
    <div className='container'>
        <div className='py-4'>
        <table className="table border shadow">
  <thead>
    <tr>
      <th scope="col">order_id</th>
      <th scope="col">cart_id</th>
      <th scope="col">User_id</th>
      <th scope="col">Rec_id</th>
    </tr>
  </thead>
  <tbody>

    {orders.map((orders,index) => (
    <tr>
      <th scope="row" key={index}>{index+1}</th>
      <td >{Orders.order_id}</td>
      <td>{Orders.cart_id}</td>
      <td>{Orders.User_id}</td>
      
    </tr>
            
        ))}
    
    
    <tr>
      {/* <th scope="row">3</th>
      <td colspan="2">Larry the Bird</td>
      <td>@twitter</td> */}
    </tr>
  </tbody>
</table>




        </div>



    </div>
  )
}
