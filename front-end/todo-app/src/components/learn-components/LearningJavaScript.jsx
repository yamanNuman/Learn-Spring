const person = {
  name: "Steven Gerrard",
  number: 8,
  teams: {
    footballTeam: "Liverpool",
    nationalTeam: "England",
  },
  profiles: ["twitter", "facebook", "instagram"],
  printProfile: () => {
    person.profiles.map((profile) => {
      console.log(profile);
    });
  },
};

export function LearningJavaScript() {
  return (
    <>
      <div>{person.name}</div>
      <div>{person.number}</div>
      <div>{person.teams.footballTeam}</div>
      <div>{person.teams.nationalTeam}</div>
      <div>{person.profiles[0]}</div>
    </>
  );
}
