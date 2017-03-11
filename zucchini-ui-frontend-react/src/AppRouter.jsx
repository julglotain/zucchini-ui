import React from 'react';
import { Provider } from 'react-redux';
import { Router, Route, IndexRoute } from 'react-router';

import store, { history } from './store';
import RootPage from './ui/components/RootPage';
import TestRunsPageContainer from './testruns/components/TestRunsPageContainer';
import TestRunsBreadcrumContainer from './testruns/components/TestRunsBreadcrumContainer';


export default function AppRouter() {
  return (
    <Provider store={store}>
      <Router history={history}>
        <Route path="/" component={RootPage}>
          <IndexRoute components={{ main: TestRunsPageContainer, breadcrum: TestRunsBreadcrumContainer }} />
        </Route>
      </Router>
    </Provider>
  );
}
