document.getElementById("rndBtn").addEventListener("click", async () => {
    try {
        const response = await fetch("http://localhost:8080/api/endpoint", {
            method: "GET",
            headers: { "Content-Type": "application/json" }
        });
        
        const daten = await response.json(); 
        console.log(daten);
       
        document.getElementById("catOutput").innerText = "Oreo says: I am " + daten.status + "!";
        
    } catch (error) {
        console.error("Fehler beim Abrufen der Katzen-Stimmung:", error);
    }
});