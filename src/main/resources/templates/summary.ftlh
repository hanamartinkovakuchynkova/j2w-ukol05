[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Rekapitulace registrace</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<main>
    <h1>Rekapitulace Registrace</h1>
    <table>
        <tr>
            <th>Jméno</th>
            <td>${registration.jmeno}</td>
        </tr>
        <tr>
            <th>Příjmení</th>
            <td>${registration.prijmeni}</td>
        </tr>
        <tr>
            <th>Datum Narození</th>
            <td>${registration.birthDate}</td>
        </tr>
        <tr>
            <th>Pohlaví</th>
            <td>${registration.pohlavi}</td>
        </tr>
        <tr>
            <th>Turnus</th>
            <td>${registration.turnus}</td>
        </tr>
        <tr>
            <th>E-mail</th>
            <td>${registration.email}</td>
        </tr>
        <tr>
            <th>Telefon</th>
            <td>${registration.telephone}</td>
        </tr>
    </table>
</main>
</body>
</html>
