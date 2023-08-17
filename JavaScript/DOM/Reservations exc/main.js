const reservations = {
            Bob: { claimed: false },
            Ted: { claimed: true }
        };

        const nameInput = document.getElementById("nameInput");
        const checkButton = document.getElementById("checkButton");
        const resultText = document.getElementById("resultText");

        function checkReservation() {
            const userName = nameInput.value;
            const reservation = reservations[userName];

            if (reservation) {
                if (!reservation.claimed) {
                    resultText.textContent = "Welcome, " + userName;
                } else {
                    resultText.textContent = "Hmm, someone already claimed this reservation.";
                }
            } else {
                resultText.textContent = "You have no reservation.";
            }
        }

        checkButton.addEventListener("click", checkReservation);