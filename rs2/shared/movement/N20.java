/*
 * Decompiled with CFR 0.146.
 */
package rs2.shared.movement;

import tfu.Ie21;

class N20 {
    static final /* synthetic */ int[] g;

    static {
        g = new int[Ie21.values().length];
        try {
            N20.g[Ie21.BOX.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            N20.g[Ie21.CAPSULE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            N20.g[Ie21.CONVEX_HULL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            N20.g[Ie21.CONVEX_2D_POLYGON.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            N20.g[Ie21.GENERIC_STATIC_MESH.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            N20.g[Ie21.SPHERE.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

