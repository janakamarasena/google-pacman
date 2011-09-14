package jp.or.iidukat.example.pacman.entity;

import java.util.ArrayList;
import java.util.List;

import jp.or.iidukat.example.pacman.Presentation;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class CutsceneCanvas {
	private Presentation presentation = new Presentation();
	
	private List<E> actors = new ArrayList<E>();
	
	void draw(Bitmap sourceImage, Canvas c) {
		if (!presentation.isVisible()) return;
		
		presentation.drawRectShape(c);
		
		for (E actor : actors) {
			actor.draw(sourceImage, c);
		}
	}

	public Presentation getPresentation() {
		return presentation;
	}
	
	public void addActor(E actor) {
		actors.add(actor);
	}
}
