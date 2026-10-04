package q6;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import c6.C2947b;
import com.prism.commons.utils.G;
import java.util.Locale;

/* JADX INFO: renamed from: q6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@TargetApi(24)
public class C5438b extends AbstractC5437a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LocaleList f226846c;

    public C5438b(String str, String str2, LocaleList localeList) {
        super(str, str2);
        this.f226846c = localeList;
    }

    @Override // q6.AbstractC5437a
    public String a() {
        return this.f226846c.get(0).getLanguage();
    }

    @Override // q6.AbstractC5437a
    public String c(Context context) {
        return context.getResources().getString(C2947b.m.f129584a0);
    }

    @Override // q6.AbstractC5437a
    public boolean d(@NonNull Locale locale) {
        return G.h(this.f226846c.get(0), locale);
    }

    @Override // q6.AbstractC5437a
    public void e(Configuration configuration) {
        configuration.setLocales(this.f226846c);
    }
}
