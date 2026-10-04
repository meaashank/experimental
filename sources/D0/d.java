package D0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4337k;
import e.InterfaceC4339m;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17621d = "ComplexColorCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f17622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f17623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17624c;

    public d(Shader shader, ColorStateList colorStateList, @InterfaceC4337k int i10) {
        this.f17622a = shader;
        this.f17623b = colorStateList;
        this.f17624c = i10;
    }

    @NonNull
    public static d a(@NonNull Resources resources, @InterfaceC4339m int i10, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return d(g.c(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            ColorStateList colorStateListB = c.b(resources, xml, attributeSetAsAttributeSet, theme);
            return new d(null, colorStateListB, colorStateListB.getDefaultColor());
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public static d b(@InterfaceC4337k int i10) {
        return new d(null, null, i10);
    }

    public static d c(@NonNull ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static d d(@NonNull Shader shader) {
        return new d(shader, null, 0);
    }

    @Nullable
    public static d g(@NonNull Resources resources, @InterfaceC4339m int i10, @Nullable Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e(f17621d, "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    @InterfaceC4337k
    public int e() {
        return this.f17624c;
    }

    @Nullable
    public Shader f() {
        return this.f17622a;
    }

    public boolean h() {
        return this.f17622a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f17622a == null && (colorStateList = this.f17623b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (!i()) {
            return false;
        }
        ColorStateList colorStateList = this.f17623b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f17624c) {
            return false;
        }
        this.f17624c = colorForState;
        return true;
    }

    public void k(@InterfaceC4337k int i10) {
        this.f17624c = i10;
    }

    public boolean l() {
        return h() || this.f17624c != 0;
    }
}
