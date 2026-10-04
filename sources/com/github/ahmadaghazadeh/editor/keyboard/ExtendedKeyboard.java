package com.github.ahmadaghazadeh.editor.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.IconCache;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.gaia.server.accounts.b;
import java.util.LinkedList;
import l5.C5146a;
import l5.C5148c;

/* JADX INFO: loaded from: classes3.dex */
public class ExtendedKeyboard extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f150535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5148c f150536b;

    public interface a {
        void a(View view, C5146a c5146a);
    }

    public ExtendedKeyboard(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        K(context);
    }

    public a I() {
        return this.f150535a;
    }

    public void J(a aVar) {
        this.f150535a = aVar;
        this.f150536b.l(aVar);
    }

    public final void K(Context context) {
        this.f150536b = new C5148c();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C5146a("Tab", TextProcessor.f150538k0, -1));
        linkedList.add(new C5146a("End", "End", -1));
        linkedList.add(new C5146a("{", "{", -1));
        linkedList.add(new C5146a("}", "}", 0));
        linkedList.add(new C5146a("(", "(", -1));
        linkedList.add(new C5146a(")", ")", 0));
        linkedList.add(new C5146a(";", ";", 0));
        linkedList.add(new C5146a(",", ",", 0));
        linkedList.add(new C5146a(IconCache.EMPTY_CLASS_NAME, IconCache.EMPTY_CLASS_NAME, 0));
        linkedList.add(new C5146a("=", "=", 0));
        linkedList.add(new C5146a("\"", "\"", 0));
        linkedList.add(new C5146a("|", "|", 0));
        linkedList.add(new C5146a("&", "&", 0));
        linkedList.add(new C5146a("!", "!", 0));
        linkedList.add(new C5146a("[", "[", -1));
        linkedList.add(new C5146a("]", "]", 0));
        linkedList.add(new C5146a("<", "<", 0));
        linkedList.add(new C5146a(">", ">", 0));
        linkedList.add(new C5146a("+", "+", 0));
        linkedList.add(new C5146a(com.prism.gaia.download.a.f164606q, com.prism.gaia.download.a.f164606q, 0));
        linkedList.add(new C5146a(RemoteSettings.FORWARD_SLASH_STRING, RemoteSettings.FORWARD_SLASH_STRING, 0));
        linkedList.add(new C5146a("*", "*", 0));
        linkedList.add(new C5146a("?", "?", 0));
        linkedList.add(new C5146a(b.f166434b0, b.f166434b0, 0));
        linkedList.add(new C5146a("_", "_", 0));
        this.f150536b.k(linkedList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        setLayoutManager(linearLayoutManager);
        setHasFixedSize(true);
        setAdapter(this.f150536b);
    }

    public ExtendedKeyboard(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        K(context);
    }

    public ExtendedKeyboard(Context context) {
        super(context, null);
        K(context);
    }
}
