package lesson31.facade;

public class MainFacade {
    public static void main(String[] args) {
        HomeSettingFacade homeSettingFacade = new HomeSettingFacade();

        homeSettingFacade.returninHome();
        homeSettingFacade.liavingHome();
    }
}
