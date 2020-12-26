import { TaskmanagementFrontendPage } from './app.po';

describe('taskmanagement-frontend App', function() {
  let page: TaskmanagementFrontendPage;

  beforeEach(() => {
    page = new TaskmanagementFrontendPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
