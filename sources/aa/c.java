package Aa;

import Ba.g;
import Ba.h;
import androidx.annotation.NonNull;
import com.prism.lib.feedback.config.InteractiveConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static b a(InteractiveConfig interactiveConfig) {
        String str = interactiveConfig.method;
        if (d.f7286a.equalsIgnoreCase(str)) {
            return new Ba.c(interactiveConfig);
        }
        if (d.f7288c.equalsIgnoreCase(str)) {
            return new h(interactiveConfig);
        }
        if (d.f7287b.equalsIgnoreCase(str)) {
            return new g(interactiveConfig);
        }
        if (d.f7289d.equalsIgnoreCase(str)) {
            return new Ba.e(interactiveConfig);
        }
        if (d.f7290e.equalsIgnoreCase(str)) {
            return new Ba.b(interactiveConfig);
        }
        if (d.f7291f.equalsIgnoreCase(str)) {
            return new Ba.f(interactiveConfig);
        }
        return null;
    }

    public static void b(List<InteractiveConfig> list) {
        InteractiveConfig interactiveConfig = new InteractiveConfig();
        interactiveConfig.method = d.f7289d;
        interactiveConfig.info = "https://support.qq.com/product/137117";
        list.add(interactiveConfig);
        InteractiveConfig interactiveConfig2 = new InteractiveConfig();
        interactiveConfig2.method = d.f7290e;
        interactiveConfig2.info = "fb://group/1206230126251006";
        list.add(interactiveConfig2);
    }

    public static void c(String str, String str2, @NonNull e eVar) {
        ArrayList<InteractiveConfig> configsByLanguage = InteractiveConfig.getConfigsByLanguage(InteractiveConfig.load(str2), str);
        if (configsByLanguage == null) {
            return;
        }
        int size = configsByLanguage.size();
        int i10 = 0;
        while (i10 < size) {
            InteractiveConfig interactiveConfig = configsByLanguage.get(i10);
            i10++;
            b bVarA = a(interactiveConfig);
            if (bVarA != null) {
                eVar.a(bVarA);
            }
        }
    }
}
