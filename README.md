# DAT108 - Oblig 4

# TODO

Påmeldingsside:

- [ ] Har felter for Fornavn, Etternavn, Mobil, Passord, Passord repetert, og kjønn
- [ ] Påmeldingsknapp for innsending av skjema
- [ ] Ved suksessfull påmelding skal man bli logget inn med mobilnummer som brukernavn
- [ ] Alle felter er obligatoriske og skal valideres som beskrevet nedenfor
- [ ] Ved suksessfull påmelding skal man få en bekreftelse på at man er påmeldt, med informasjonen man er meldt på med.

Deltagerliste:

- [ ] Siden har en liste over deltagere og en knapp for å logge ut
- [ ] For å kunne se deltagerlisten må man være innlogget som en påmeldt deltager. Siden skal sikres mot uautorisert tilgang.
- [ ] Uautorisert tilgang sender deg til innloggingssiden
- [ ] Listen av deltagere skal være sortert stigende på fornavn, så etternavn.
- [ ] Innlogget deltager er uthevet med grønn bakgrunn
- [ ] Trykk på Logg ut skal logge ut brukeren og ta deg tilbake til innloggingssiden.

Innloggingsside:

- [ ] Siden har et skjema med bokser for Mobil og Passord, og en knapp for å logge inn.
- [ ] Vellykket innlogging sender deg videre til deltagerlisten
- [ ] Ved ulike feilsituasjoner skal man sendes tilbake til innloggingssiden med feilmelding i rødt
- Eksempler på feilmeldinger:
  - [ ] Forsøk på requester som krever at du er innlogget når du ikke er det
  - [ ] Ugyldig info ved innlogging
  - [ ] Andre relevante feil

Validering:

- [ ] Validering av input ved påmelding skal skje BÅDE hos klient og på tjener
- [ ] Validering i nettleser gir brukeren umiddelbar tilbakemelding mens det tastes, feks styrke på passord
- [ ] Validering i tjener sikrer at mottatt data er gyldig
- [ ] FORNAVN: 2-20 tegn, kan inneholde bokstaver (inkl. æøåÆØÅ), bindestrek og mellomrom. Første tegn skal være stor bokstav.
- [ ] ETTERNAVN: 2-20 tegn, kan inneholde bokstaver, bindestrek (ikke mellomrom). Første tegn skal være stor bokstav
- [ ] MOBIL: Eksakt 8 siffer. Må være unikt, altså kan ikke samme nummer være brukt før.
- [ ] PASSORD: Bestem krav til passord selv, styrke på passord skal angis med farge mens man skriver, sistenevnte kun på klientsiden.
- [ ] REPETERT PASSORD: Må være helt likt passord.
- [ ] KJØNN: Sjekkboks for mann eller kvinne.
- [ ] Data valideres på klienten før de sendes til tjeneren. Man skal kunne se "live" om dataen er gyldig eller ikke. Rød ramme er ugyldig, grønn ramme er gyldig. For passord har man gul ramme hvis gyldig men svakt passord, og grønn ramme hvis gyldig og sterkt passord.
