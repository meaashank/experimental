package androidx.privacysandbox.ads.adservices.appsetid;

import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl", f = "AppSetIdManager.kt", i = {}, l = {55}, m = "getAppSetId", n = {}, s = {})
public final class AppSetIdManager$Api33Ext4Impl$getAppSetId$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f116040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f116041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppSetIdManager.Api33Ext4Impl f116042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSetIdManager$Api33Ext4Impl$getAppSetId$1(AppSetIdManager.Api33Ext4Impl api33Ext4Impl, kotlin.coroutines.e<? super AppSetIdManager$Api33Ext4Impl$getAppSetId$1> eVar) {
        super(eVar);
        this.f116042c = api33Ext4Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f116041b = obj;
        this.f116043d |= Integer.MIN_VALUE;
        return this.f116042c.a(this);
    }
}
