package q6;

import android.content.res.Configuration;
import android.os.Build;
import androidx.annotation.NonNull;
import com.prism.commons.utils.G;
import java.util.Locale;

/* JADX INFO: renamed from: q6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5439c extends AbstractC5437a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Locale f226847c;

    public C5439c(String str, String str2, Locale locale) {
        super(str, str2);
        this.f226847c = locale;
    }

    @Override // q6.AbstractC5437a
    public String a() {
        return this.f226847c.getLanguage();
    }

    @Override // q6.AbstractC5437a
    public boolean d(@NonNull Locale locale) {
        return G.h(this.f226847c, locale);
    }

    @Override // q6.AbstractC5437a
    public void e(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            configuration.setLocale(this.f226847c);
        } else {
            configuration.locale = this.f226847c;
        }
    }
}
