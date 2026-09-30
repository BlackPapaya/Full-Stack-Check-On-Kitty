document.getElementById("rndBtn").addEventListener("click", async () => {
    try {
        const response = await fetch("/api/endpoint", {
            method: "GET",
            headers: { "Content-Type": "application/json" }
        });
        
        const daten = await response.json(); 
        console.log(daten);
       
        document.getElementById("catOutput").innerText = "Deine Katze sagt: Ich bin " + daten.status + "!";
        
    } catch (error) {
        console.error("Fehler beim Abrufen der Katzen-Stimmung:", error);
    }
});