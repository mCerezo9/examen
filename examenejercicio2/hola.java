// Obtener datos del clima para una ciudad
async function getWeather(city) {
    const apiKey = 'YOUR_API_KEY';
    const response = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}`);
    const data = await response.json();
    return data;
}



