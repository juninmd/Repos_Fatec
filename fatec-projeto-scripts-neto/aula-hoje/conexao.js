/*
/     configurações de acesso ao banco de dados
*/
var mysql = require('mysql');
var database = 'dados191n';

// A senha vem do ambiente: credencial nunca entra no repositorio.
if (!process.env.DB_PASSWORD) {
    throw new Error('DB_PASSWORD nao definida: exporte a senha do MySQL antes de rodar');
}

// instanciar objeto de acesso ao banco de dados
var client = mysql.createConnection({
    user: process.env.DB_USER || 'root',
    password: process.env.DB_PASSWORD,
    host: process.env.DB_HOST || 'localhost',
    port: Number(process.env.DB_PORT) || 3306
});

client.query('USE ' + database);

module.exports = client;
