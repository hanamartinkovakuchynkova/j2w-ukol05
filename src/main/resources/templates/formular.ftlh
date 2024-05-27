[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registrace na letní dětský tábor</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<main>
    <h1>Registrace na letní dětský tábor</h1>
    <form>
        <label for="jmeno" class="radek">Jméno:</label>
        [@spring.formInput path="form.jmeno" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="prijmeni" class="radek">Příjmení:</label>
        [@spring.formInput path="form.prijmeni" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="birthDate" class="radek">Datum narození:</label>
        [@spring.formInput path="form.birthDate" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="pohlavi" class="radek">Pohlaví:</label>
        [@spring.formInput path="form.pohlavi" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="turnus" class="radek">Turnus:</label>
        [@spring.formInput path="form.turnus" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="email" class="radek">E-mail:</label>
        [@spring.formInput path="form.email" fieldType="email" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="telephone" class="radek">Telephone:</label>
        [@spring.formInput path="form.telephone" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <div class="radek controls">
            <button type="submit">Registrovat</button>
        </div>
    </form>
</main>
</body>
</html>