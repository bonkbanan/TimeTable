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
    </thead>
    <#list rooms as room>
        <tr>
            <td>${room.id}</td>
            <td>${room.name}</td>
            <td>${room.capacity}</td>
        </tr>
    </#list>
</table>
</center>
</body>
</html>