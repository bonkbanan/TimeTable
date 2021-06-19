<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Update Room</title>
</head>
<body>
<center><h1>Update  Room</h1></center>
<div>
    <fieldset>
        <form name="room" action="" method="POST">
            Id :<@spring.formInput "form.id" "" "text"/> <br>
            Name :<@spring.formInput "form.name" "" "text"/>
            <br>
            Capacity :<@spring.formInput "form.capacity" "" "number"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>

</body>
</html>