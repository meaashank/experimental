package Z1;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.core.app.A;
import androidx.core.app.NotificationCompat;
import androidx.media.u;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    public static class a extends C0155b {
        @Override // Z1.b.C0155b
        public int E(int i10) {
            return i10 <= 3 ? u.g.f114768h : u.g.f114766f;
        }

        @Override // Z1.b.C0155b
        public int F() {
            return this.f110876a.getContentView() != null ? u.g.f114773m : u.g.f114772l;
        }

        public final void L(RemoteViews remoteViews) {
            remoteViews.setInt(u.e.f114758z, "setBackgroundColor", this.f110876a.getColor() != 0 ? this.f110876a.getColor() : this.f110876a.mContext.getResources().getColor(u.b.f114683c));
        }

        @Override // Z1.b.C0155b, androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void b(A a10) {
            if (Build.VERSION.SDK_INT >= 24) {
                a10.a().setStyle(A(Z1.a.a()));
            } else {
                super.b(a10);
            }
        }

        @Override // Z1.b.C0155b, androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews v(A a10) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews bigContentView = this.f110876a.getBigContentView() != null ? this.f110876a.getBigContentView() : this.f110876a.getContentView();
            if (bigContentView == null) {
                return null;
            }
            RemoteViews remoteViewsB = B();
            e(remoteViewsB, bigContentView);
            L(remoteViewsB);
            return remoteViewsB;
        }

        @Override // Z1.b.C0155b, androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews w(A a10) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            boolean z10 = this.f110876a.getContentView() != null;
            if (!z10 && this.f110876a.getBigContentView() == null) {
                return null;
            }
            RemoteViews remoteViewsC = C();
            if (z10) {
                e(remoteViewsC, this.f110876a.getContentView());
            }
            L(remoteViewsC);
            return remoteViewsC;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews x(A a10) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews headsUpContentView = this.f110876a.getHeadsUpContentView() != null ? this.f110876a.getHeadsUpContentView() : this.f110876a.getContentView();
            if (headsUpContentView == null) {
                return null;
            }
            RemoteViews remoteViewsB = B();
            e(remoteViewsB, headsUpContentView);
            L(remoteViewsB);
            return remoteViewsB;
        }
    }

    /* JADX INFO: renamed from: Z1.b$b, reason: collision with other inner class name */
    public static class C0155b extends NotificationCompat.u {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f79392i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f79393j = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f79394e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public MediaSessionCompat.Token f79395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f79396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f79397h;

        public C0155b() {
        }

        public static MediaSessionCompat.Token G(Notification notification) {
            Parcelable parcelable;
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null || (parcelable = extras.getParcelable(NotificationCompat.EXTRA_MEDIA_SESSION)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.fromToken(parcelable);
        }

        @T(21)
        public Notification.MediaStyle A(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.f79394e;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.f79395f;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        public RemoteViews B() {
            int iMin = Math.min(this.f110876a.mActions.size(), 5);
            RemoteViews remoteViewsC = c(false, E(iMin), false);
            remoteViewsC.removeAllViews(u.e.f114751s);
            if (iMin > 0) {
                for (int i10 = 0; i10 < iMin; i10++) {
                    remoteViewsC.addView(u.e.f114751s, D(this.f110876a.mActions.get(i10)));
                }
            }
            if (!this.f79396g) {
                remoteViewsC.setViewVisibility(u.e.f114741i, 8);
                return remoteViewsC;
            }
            int i11 = u.e.f114741i;
            remoteViewsC.setViewVisibility(i11, 0);
            remoteViewsC.setInt(i11, "setAlpha", this.f110876a.mContext.getResources().getInteger(u.f.f114759a));
            remoteViewsC.setOnClickPendingIntent(i11, this.f79397h);
            return remoteViewsC;
        }

        public RemoteViews C() {
            RemoteViews remoteViewsC = c(false, F(), true);
            int size = this.f110876a.mActions.size();
            int[] iArr = this.f79394e;
            int iMin = iArr == null ? 0 : Math.min(iArr.length, 3);
            remoteViewsC.removeAllViews(u.e.f114751s);
            if (iMin > 0) {
                for (int i10 = 0; i10 < iMin; i10++) {
                    if (i10 >= size) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i10), Integer.valueOf(size - 1)));
                    }
                    remoteViewsC.addView(u.e.f114751s, D(this.f110876a.mActions.get(this.f79394e[i10])));
                }
            }
            if (!this.f79396g) {
                remoteViewsC.setViewVisibility(u.e.f114743k, 0);
                remoteViewsC.setViewVisibility(u.e.f114741i, 8);
                return remoteViewsC;
            }
            remoteViewsC.setViewVisibility(u.e.f114743k, 8);
            int i11 = u.e.f114741i;
            remoteViewsC.setViewVisibility(i11, 0);
            remoteViewsC.setOnClickPendingIntent(i11, this.f79397h);
            remoteViewsC.setInt(i11, "setAlpha", this.f110876a.mContext.getResources().getInteger(u.f.f114759a));
            return remoteViewsC;
        }

        public final RemoteViews D(NotificationCompat.Action action) {
            boolean z10 = action.a() == null;
            RemoteViews remoteViews = new RemoteViews(this.f110876a.mContext.getPackageName(), u.g.f114763c);
            int i10 = u.e.f114733a;
            remoteViews.setImageViewResource(i10, action.e());
            if (!z10) {
                remoteViews.setOnClickPendingIntent(i10, action.a());
            }
            remoteViews.setContentDescription(i10, action.j());
            return remoteViews;
        }

        public int E(int i10) {
            return i10 <= 3 ? u.g.f114767g : u.g.f114765e;
        }

        public int F() {
            return u.g.f114772l;
        }

        public C0155b H(PendingIntent pendingIntent) {
            this.f79397h = pendingIntent;
            return this;
        }

        public C0155b I(MediaSessionCompat.Token token) {
            this.f79395f = token;
            return this;
        }

        public C0155b J(int... iArr) {
            this.f79394e = iArr;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void b(A a10) {
            a10.a().setStyle(A(new Notification.MediaStyle()));
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews v(A a10) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews w(A a10) {
            return null;
        }

        public C0155b(NotificationCompat.Builder builder) {
            z(builder);
        }

        public C0155b K(boolean z10) {
            return this;
        }
    }
}
