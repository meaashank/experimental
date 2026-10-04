package com.android.launcher3.graphics;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.shapes.PathShape;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class TriangleShape extends PathShape {
    private Path mTriangularPath;

    public TriangleShape(Path path, float f10, float f11) {
        super(path, f10, f11);
        this.mTriangularPath = path;
    }

    public static TriangleShape create(float f10, float f11, boolean z10) {
        Path path = new Path();
        if (z10) {
            path.moveTo(0.0f, f11);
            path.lineTo(f10, f11);
            path.lineTo(f10 / 2.0f, 0.0f);
            path.close();
        } else {
            path.moveTo(0.0f, 0.0f);
            path.lineTo(f10 / 2.0f, f11);
            path.lineTo(f10, 0.0f);
            path.close();
        }
        return new TriangleShape(path, f10, f11);
    }

    @Override // android.graphics.drawable.shapes.Shape
    public void getOutline(@NonNull Outline outline) {
        outline.setConvexPath(this.mTriangularPath);
    }
}
