import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table17 from './table-17';
import Table17Detail from './table-17-detail';
import Table17Update from './table-17-update';
import Table17DeleteDialog from './table-17-delete-dialog';

const Table17Routes = () => (
  <ErrorBoundaryRoutes>
    <Route index element={<Table17 />} />
    <Route path="new" element={<Table17Update />} />
    <Route path=":id">
      <Route index element={<Table17Detail />} />
      <Route path="edit" element={<Table17Update />} />
      <Route path="delete" element={<Table17DeleteDialog />} />
    </Route>
  </ErrorBoundaryRoutes>
);

export default Table17Routes;
