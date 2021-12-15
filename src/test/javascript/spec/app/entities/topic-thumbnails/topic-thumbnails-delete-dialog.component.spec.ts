import { ComponentFixture, TestBed, inject, fakeAsync, tick } from '@angular/core/testing';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { of } from 'rxjs';
import { JhiEventManager } from 'ng-jhipster';

import { DiscourseTestModule } from '../../../test.module';
import { MockEventManager } from '../../../helpers/mock-event-manager.service';
import { MockActiveModal } from '../../../helpers/mock-active-modal.service';
import { TopicThumbnailsDeleteDialogComponent } from 'app/entities/topic-thumbnails/topic-thumbnails-delete-dialog.component';
import { TopicThumbnailsService } from 'app/entities/topic-thumbnails/topic-thumbnails.service';

describe('Component Tests', () => {
  describe('TopicThumbnails Management Delete Component', () => {
    let comp: TopicThumbnailsDeleteDialogComponent;
    let fixture: ComponentFixture<TopicThumbnailsDeleteDialogComponent>;
    let service: TopicThumbnailsService;
    let mockEventManager: MockEventManager;
    let mockActiveModal: MockActiveModal;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [DiscourseTestModule],
        declarations: [TopicThumbnailsDeleteDialogComponent],
      })
        .overrideTemplate(TopicThumbnailsDeleteDialogComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(TopicThumbnailsDeleteDialogComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(TopicThumbnailsService);
      mockEventManager = TestBed.get(JhiEventManager);
      mockActiveModal = TestBed.get(NgbActiveModal);
    });

    describe('confirmDelete', () => {
      it('Should call delete service on confirmDelete', inject(
        [],
        fakeAsync(() => {
          // GIVEN
          spyOn(service, 'delete').and.returnValue(of({}));

          // WHEN
          comp.confirmDelete(123);
          tick();

          // THEN
          expect(service.delete).toHaveBeenCalledWith(123);
          expect(mockActiveModal.closeSpy).toHaveBeenCalled();
          expect(mockEventManager.broadcastSpy).toHaveBeenCalled();
        })
      ));

      it('Should not call delete service on clear', () => {
        // GIVEN
        spyOn(service, 'delete');

        // WHEN
        comp.cancel();

        // THEN
        expect(service.delete).not.toHaveBeenCalled();
        expect(mockActiveModal.dismissSpy).toHaveBeenCalled();
      });
    });
  });
});
