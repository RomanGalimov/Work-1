package Lesson_6.HomeWork;

/**
 * Created by Gubanov Pavel on 08.12.16.
 */
class Player implements SoccerPlayer {

    private String nickname;
    private Integer points;
    private LeagueName leagueName;
    private CountryName countryName;

    Player(String nickname, Integer points, LeagueName leagueName, CountryName countryName) {
        this.nickname = nickname;
        this.points = points;
        this.leagueName = leagueName;
        this.countryName = countryName;
    }

    @Override
    public String getNickName() {
        return nickname;
    }

    @Override
    public Integer getPoints() {
        return points;
    }

    public LeagueName getLeagueName() {
        return leagueName;
    }

    public CountryName getCountryName() {
        return countryName;
    }
}
