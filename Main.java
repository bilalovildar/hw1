public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross[]{new Cross(450)});
        Member member1 = new Member("Igor", 400);
        Member member2 = new Member("Sasha", 420);
        Member member3 = new Member("Grisha", 500);
        Member member4 = new Member("Denis", 540);
        Member[] members = {member1, member2, member3, member4};
        Team team = new Team("Winners", members); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        System.out.println("Участники, которые преодолели испытание : ");
        team.showResults(); // Показываем результаты

    }
}
