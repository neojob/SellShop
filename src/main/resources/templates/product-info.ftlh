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
    <h1>BuySell Product Page</h1><br>
    <strong>Id:</strong> ${product.id}<br>
    <strong>Title:</strong> ${product.title}<br>
    <strong>Description:</strong> ${product.description}<br>
    <strong>City:</strong> ${product.city}<br>
    <strong>Author:</strong> ${product.author}<br>
    <strong>Price:</strong> ${product.price}<br>
<br>
    <form action="/product/delete/${product.id}" method="post">
        <input type="submit" value="Remove Product">
    </form>
</body>
</html>