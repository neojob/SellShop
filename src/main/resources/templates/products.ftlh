<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>BuySell</h1>
    <hr>
    <form action="/" method="get">
        Search: <input type="text" name="title">
        <input type="submit" value="Search">
    </form>
    <hr>
    
    <h4> Products from Everywhere</h4>
    <#list products as product>
            <div>
                <p><b>${product.title} </b>
                ${product.price} | <a href="/product/${product.id}">See more...</a></p>
            </div>
        <#else>
            <h3>No products</h3>
    </#list>
    <hr>
    <h3>Create new product...</h3>
    <form action="/product/create" method="post" enctype="multipart/form-data">
        Title: <input type="text" name="title"><br><br>
        Description: <input type="text" name="description"><br><br>
        Price: <input type="text" name="price"><br><br>
        City: <input type="text" name="city"><br><br>
        Author: <input type="text" name="author"><br><br>
        First image<input type="file" name="file1"><br><br>
        Second image<input type="file" name="file2"><br><br>
        Third image<input type="file" name="file3"><br><br>
        <input type="submit" value="Add product">

    </form>
</body>
</html>