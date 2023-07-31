package sg.edu.rp.c326.id22015010.p10_demoandroidlist;

import androidx.annotation.NonNull;

public class AndroidVersion {
    private String name;
    private String version;

    public AndroidVersion(String name, String version){
        this.name = name;
        this.version = version;
    }

    public String getName(){
        return name;
    }
    public String getVersion(){
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }
    @NonNull
    @Override
    public String toString() {
        //return name + "\n" + version;
        return "AndroidVersion{name='"+name+"', version='"+version+"'}";
        //return name+":"+version;
    }
}
