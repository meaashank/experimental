package A4;

import bc.InterfaceC2856f;
import com.cookiegames.smartcookie.settings.activity.SettingsActivity;
import javax.inject.Provider;
import u4.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements InterfaceC2856f<SettingsActivity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<e> f2343a;

    public b(Provider<e> provider) {
        this.f2343a = provider;
    }

    public static InterfaceC2856f<SettingsActivity> a(Provider<e> provider) {
        return new b(provider);
    }

    public static void c(SettingsActivity settingsActivity, e eVar) {
        settingsActivity.f147785a = eVar;
    }

    @Override // bc.InterfaceC2856f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(SettingsActivity settingsActivity) {
        settingsActivity.f147785a = this.f2343a.get();
    }
}
