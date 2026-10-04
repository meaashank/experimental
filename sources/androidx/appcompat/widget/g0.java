package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class g0 extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f86374c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86375d = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f86376b;

    public g0(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.f86376b = new WeakReference<>(context);
    }

    public static boolean b() {
        return f86374c;
    }

    public static void c(boolean z10) {
        f86374c = z10;
    }

    public static boolean d() {
        return false;
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public XmlResourceParser getAnimation(int i10) throws Resources.NotFoundException {
        return this.f86003a.getAnimation(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public boolean getBoolean(int i10) throws Resources.NotFoundException {
        return this.f86003a.getBoolean(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public int getColor(int i10) throws Resources.NotFoundException {
        return this.f86003a.getColor(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public ColorStateList getColorStateList(int i10) throws Resources.NotFoundException {
        return this.f86003a.getColorStateList(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f86003a.getConfiguration();
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public float getDimension(int i10) throws Resources.NotFoundException {
        return this.f86003a.getDimension(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public int getDimensionPixelOffset(int i10) throws Resources.NotFoundException {
        return this.f86003a.getDimensionPixelOffset(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public int getDimensionPixelSize(int i10) throws Resources.NotFoundException {
        return this.f86003a.getDimensionPixelSize(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f86003a.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Context context = this.f86376b.get();
        return context != null ? J.h().t(context, this, i10) : a(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    @e.T(15)
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i10, int i11) throws Resources.NotFoundException {
        return super.getDrawableForDensity(i10, i11);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public float getFraction(int i10, int i11, int i12) {
        return this.f86003a.getFraction(i10, i11, i12);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f86003a.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public int[] getIntArray(int i10) throws Resources.NotFoundException {
        return this.f86003a.getIntArray(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public int getInteger(int i10) throws Resources.NotFoundException {
        return this.f86003a.getInteger(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public XmlResourceParser getLayout(int i10) throws Resources.NotFoundException {
        return this.f86003a.getLayout(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public Movie getMovie(int i10) throws Resources.NotFoundException {
        return this.f86003a.getMovie(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public String getQuantityString(int i10, int i11, Object[] objArr) throws Resources.NotFoundException {
        return this.f86003a.getQuantityString(i10, i11, objArr);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public CharSequence getQuantityText(int i10, int i11) throws Resources.NotFoundException {
        return this.f86003a.getQuantityText(i10, i11);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public String getResourceEntryName(int i10) throws Resources.NotFoundException {
        return this.f86003a.getResourceEntryName(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public String getResourceName(int i10) throws Resources.NotFoundException {
        return this.f86003a.getResourceName(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public String getResourcePackageName(int i10) throws Resources.NotFoundException {
        return this.f86003a.getResourcePackageName(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public String getResourceTypeName(int i10) throws Resources.NotFoundException {
        return this.f86003a.getResourceTypeName(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public String getString(int i10) throws Resources.NotFoundException {
        return this.f86003a.getString(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public String[] getStringArray(int i10) throws Resources.NotFoundException {
        return this.f86003a.getStringArray(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public CharSequence getText(int i10) throws Resources.NotFoundException {
        return this.f86003a.getText(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public CharSequence[] getTextArray(int i10) throws Resources.NotFoundException {
        return this.f86003a.getTextArray(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i10, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        super.getValue(i10, typedValue, z10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    @e.T(15)
    public /* bridge */ /* synthetic */ void getValueForDensity(int i10, int i11, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        super.getValueForDensity(i10, i11, typedValue, z10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public XmlResourceParser getXml(int i10) throws Resources.NotFoundException {
        return this.f86003a.getXml(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f86003a.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public TypedArray obtainTypedArray(int i10) throws Resources.NotFoundException {
        return this.f86003a.obtainTypedArray(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public InputStream openRawResource(int i10) throws Resources.NotFoundException {
        return this.f86003a.openRawResource(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i10) throws Resources.NotFoundException {
        return this.f86003a.openRawResourceFd(i10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    @e.T(21)
    public Drawable getDrawableForDensity(int i10, int i11, Resources.Theme theme) {
        return D0.i.h(this.f86003a, i10, i11, theme);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public String getQuantityString(int i10, int i11) throws Resources.NotFoundException {
        return this.f86003a.getQuantityString(i10, i11);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public String getString(int i10, Object[] objArr) throws Resources.NotFoundException {
        return this.f86003a.getString(i10, objArr);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public CharSequence getText(int i10, CharSequence charSequence) {
        return this.f86003a.getText(i10, charSequence);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        super.getValue(str, typedValue, z10);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public InputStream openRawResource(int i10, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f86003a.openRawResource(i10, typedValue);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    @e.T(21)
    public Drawable getDrawable(int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return D0.i.g(this.f86003a, i10, theme);
    }
}
