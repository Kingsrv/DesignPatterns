package creational.factory;

public class Flutter {

    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Theme set");
    }

    public void setRefreshRate(){
        System.out.println("refresh set");
    }
    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(platform);
    }
}
