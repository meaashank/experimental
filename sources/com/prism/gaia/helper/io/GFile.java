package com.prism.gaia.helper.io;

import U6.c;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.gaia.helper.GUri;
import com.prism.gaia.helper.e;
import com.prism.gaia.helper.utils.l;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class GFile extends File {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165043a = "GFile";

    public GFile(String str) {
        super(str);
    }

    public GFile A(int i10) throws IOException {
        C(i10);
        return this;
    }

    public void B() throws IOException {
        C(-1);
    }

    public void C(int i10) throws IOException {
        l.K(this, i10);
    }

    public GFile d() {
        return new GFile(c.F().n(getAbsolutePath(), s()));
    }

    public GFile e(GUri gUri) {
        return new GFile(c.F().m(getAbsolutePath(), gUri));
    }

    public GFile f(String str) {
        return new GFile(c.F().n(getAbsolutePath(), str));
    }

    public GFile g(GUri gUri) {
        return new GFile(c.F().a(getAbsolutePath(), gUri));
    }

    public GFile h(String str) {
        return new GFile(c.F().b(getAbsolutePath(), str));
    }

    public GFile i() throws IOException {
        k();
        return this;
    }

    public GFile j(int i10) throws IOException {
        l(i10);
        return this;
    }

    public void k() throws IOException {
        l(-1);
    }

    public void l(int i10) throws IOException {
        l.w(this, i10);
    }

    public final e m() {
        return c.F();
    }

    @Nullable
    public String n() {
        return c.F().c(getAbsolutePath());
    }

    @Override // java.io.File
    @Nullable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public GFile getParentFile() {
        String parent = getParent();
        if (parent == null) {
            return null;
        }
        return new GFile(parent);
    }

    @Nullable
    public GFile r(String str) {
        String parent = getParent();
        if (parent == null) {
            return null;
        }
        return new GFile(parent, str);
    }

    @NonNull
    public String s() {
        return c.F().d(getAbsolutePath());
    }

    @NonNull
    public GUri t() {
        return c.F().e(getAbsolutePath());
    }

    public boolean u() {
        return c.F().f(getAbsolutePath());
    }

    public boolean v() {
        return c.F().g(getAbsolutePath());
    }

    public boolean w() {
        return c.F().h(getAbsolutePath());
    }

    public boolean x() {
        return c.F().k(getAbsolutePath());
    }

    public boolean y() {
        return c.F().l(getAbsolutePath());
    }

    public GFile z() throws IOException {
        B();
        return this;
    }

    public GFile(File file) {
        super(file.getAbsolutePath());
    }

    public GFile(String str, String str2) {
        super(str, str2);
    }

    public GFile(File file, String str) {
        super(file, str);
    }
}
