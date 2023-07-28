<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>College Departments</title>
  
</head>
<style>
body {
width: 100%;
    background: linear-gradient(to top, rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url("https://images.collegedunia.com/public/college_data/images/appImage/28774_PSNCETTIRUNELVELI_APP.jpg");
    background-position: center;
    background-size: cover;
    height: 100vh;
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

.container {
    max-width: 600px;
    margin: 0 auto;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    border-radius: 5px;
    margin-top: 50px;
}

h1 {
    text-align: center;
    margin-bottom: 20px;
    color: #2c3e50;
}

.departments-list {
    list-style: none;
    padding: 0;
}

.department {
    padding: 10px 20px;
    border-bottom: 1px solid #ccc;
    color: #2c3e50;
    background-color: #f9e79f;
    transition: background-color 0.2s ease;
    cursor: pointer;
}

.department:hover {
    background-color: #f1c40f;
}

.department:last-child {
    border-bottom: none;
}

</style>
<body>
    <div class="container">
        <h1>College Departments</h1>
        <ul class="departments-list">
            <li class="department">Computer Science</li>
            <li class="department">Electrical Engineering</li>
            <li class="department">Mechanical Engineering</li>
            <li class="department">Chemistry</li>
            <li class="department">Physics</li>
            <li class="department">Biology</li>
            <!-- Add more departments here -->
        </ul>
    </div>
</body>
</html>

