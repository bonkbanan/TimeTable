<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Rooms</title>
</head>
<body>
<center><h3>List of Rooms</h3></center>
<center>
<table class="table table-dark table-sm" style="width:40%" align="centre">
    <thead class="table-light">
        <th>ID</th>
        <th>Name</th>
        <th>Capacity</th>
        <th>Delete</th>
        <th>Update</th>
    </thead>
    <#list rooms as room>
        <tr>
            <td>${room.id}</td>
            <td>${room.name}</td>
            <td>${room.capacity}</td>
            <td><button type="button" class="btn btn-danger"><a href="/ui/rooms/delete/${room.id}">Delete</a></button></td>
            <td><button type="button" class="btn btn-success"><a href="/ui/rooms/update/${room.id}">Update</a></button></td>
        </tr>
    </#list>
</table>
</center>
<center><button><a href="/index.html">back</a></button></center>
<center><button><a href="/ui/rooms/renew">reNew</a></button></center>
<center><button><a href="/ui/rooms/create">Create</a></button></center>
</body>
</html>