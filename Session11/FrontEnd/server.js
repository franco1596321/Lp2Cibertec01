const express = require('express');// ES como una importacion de java

const app = express();

const path = require('path');//Llamando a otra libreria que no ha sido instalada
//por defecto es libreria propia de node.js
                             //CONSTANTE PARA PODER MAPEAR RUTAS EN EL SITIO

const router = express.Router();
//router* --> hace toda la tarea de los controladores y usandolas
//poder trabajar con la web mediante express y que la variable defina las rutas o apis.

router.get('/', function (req, res) {  //que quiero que pase cuando un usuario ingrese,//esta ruta tiene por defecto un req,res
    res.sendFile(path.join(__dirname + '/index.html'));//cada vez que alguien me llame, utilizar mi archivo index.html
});//variable del sistema __dirname(directorioPrincipal) --> llamando a index.html



//express.static --> quiero publicar archivos estaticos,
app.use('/front', express.static(path.join(__dirname, ''))) //poder mapear toda una carpeta entera
//que en este caso seria FRONTEND,


app.use('/', router);//por defecto esto responda siempre cuando los usuarios entren por defecto
//se manda al router.
app.listen(3000);//quiero que mi aplicativo corra en un puerto
//explicacion de use y listen: cualquier persona--------------
//que entre por el puerto 3000 y ruta por defecto, se le va a reconocer



console.log("Server Front is Running")