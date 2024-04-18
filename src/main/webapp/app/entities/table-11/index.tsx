import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table11 from './table-11';
import Table11Detail from './table-11-detail';
import Table11Update from './table-11-update';
import Table11DeleteDialog from './table-11-delete-dialog';

const Table11Routes = () => (
  <ErrorBoundaryRoutes>
    <Route index element={<Table11 />} />
    <Route path="new" element={<Table11Update />} />
    <Route path=":id">
      <Route index element={<Table11Detail />} />
      <Route path="edit" element={<Table11Update />} />
      <Route path="delete" element={<Table11DeleteDialog />} />
    </Route>
  </ErrorBoundaryRoutes>
);

export default Table11Routes;
