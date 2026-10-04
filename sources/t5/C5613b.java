package t5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;

/* JADX INFO: renamed from: t5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5613b implements InterfaceC5614c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f239208a;

    public C5613b(Context context) {
        this.f239208a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override // t5.InterfaceC5614c
    public String a() {
        return this.f239208a.getString("FILE_SORT_MODE", "SORT_BY_NAME");
    }

    @Override // t5.InterfaceC5614c
    public void b(String str) {
        this.f239208a.edit().putString("FEXPLORER_WORKING_FOLDER", str).apply();
    }

    @Override // t5.InterfaceC5614c
    public boolean c() {
        return this.f239208a.getBoolean("READ_ONLY", false);
    }

    @Override // t5.InterfaceC5614c
    public boolean d() {
        return this.f239208a.getBoolean("USE_EXTENDED_KEYS", false);
    }

    @Override // t5.InterfaceC5614c
    public boolean e() {
        return this.f239208a.getBoolean("USE_IME_KEYBOARD", false);
    }

    @Override // t5.InterfaceC5614c
    public boolean f() {
        return this.f239208a.getBoolean("WRAP_CONTENT", true);
    }

    @Override // t5.InterfaceC5614c
    public boolean g() {
        return this.f239208a.getBoolean("CODE_COMPLETION", true);
    }

    @Override // t5.InterfaceC5614c
    public boolean h() {
        return this.f239208a.getBoolean("DISABLE_SWIPE", false);
    }

    @Override // t5.InterfaceC5614c
    public int i() {
        return this.f239208a.getInt("FONT_SIZE", 14);
    }

    @Override // t5.InterfaceC5614c
    public boolean j() {
        return this.f239208a.getBoolean("BRACKET_MATCHING", true);
    }

    @Override // t5.InterfaceC5614c
    public String k() {
        return this.f239208a.getString("FONT_TYPE", "droid_sans_mono");
    }

    @Override // t5.InterfaceC5614c
    public boolean l() {
        return this.f239208a.getBoolean("INSERT_BRACKET", true);
    }

    @Override // t5.InterfaceC5614c
    public void m(boolean z10) {
        this.f239208a.edit().putBoolean("READ_ONLY", z10).apply();
    }

    @Override // t5.InterfaceC5614c
    public String n() {
        return this.f239208a.getString("FEXPLORER_WORKING_FOLDER", Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    @Override // t5.InterfaceC5614c
    public boolean o() {
        return this.f239208a.getBoolean("PINCH_ZOOM", true);
    }

    @Override // t5.InterfaceC5614c
    public int p() {
        return 5;
    }

    @Override // t5.InterfaceC5614c
    public boolean q() {
        return this.f239208a.getBoolean("CONFIRM_EXIT", true);
    }

    @Override // t5.InterfaceC5614c
    public boolean r() {
        return this.f239208a.getBoolean("INDENT_LINE", true);
    }

    @Override // t5.InterfaceC5614c
    public boolean s() {
        return this.f239208a.getBoolean("SYNTAX_HIGHLIGHT", true);
    }

    @Override // t5.InterfaceC5614c
    public boolean t() {
        return this.f239208a.getBoolean("SHOW_HIDDEN_FILES", false);
    }

    @Override // t5.InterfaceC5614c
    public boolean u() {
        return this.f239208a.getBoolean("FULLSCREEN_MODE", false);
    }

    @Override // t5.InterfaceC5614c
    public void v(boolean z10) {
        this.f239208a.edit().putBoolean("SYNTAX_HIGHLIGHT", z10).apply();
    }

    @Override // t5.InterfaceC5614c
    public boolean w() {
        return this.f239208a.getBoolean("RESUME_SESSION", true);
    }

    @Override // t5.InterfaceC5614c
    public boolean x() {
        return this.f239208a.getBoolean("ALLOW_CREATING_FILES", true);
    }

    @Override // t5.InterfaceC5614c
    public boolean y() {
        return this.f239208a.getBoolean("HIGHLIGHT_CURRENT_LINE", true);
    }

    @Override // t5.InterfaceC5614c
    public boolean z() {
        return this.f239208a.getBoolean("SHOW_LINE_NUMBERS", true);
    }
}
