<?php
	require "conn.php";

	$username = $_POST["username"];
	$password = $_POST["password"];
	$created_on;


	$mysql_qry = "insert into users (username, password, created_on)
					values ('$username', '$password', CURDATE());";

	if ($conn->query($mysql_qry) === TRUE)
		echo "Insert successful";
	else
		echo "error: " . $mysql_qry . "<br>" . $conn->error;

	$conn->close();
?>