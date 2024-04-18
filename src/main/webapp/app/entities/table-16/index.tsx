import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table16 from './table-16';
import Table16Detail from './table-16-detail';
import Table16Update from './table-16-update';
import Table16DeleteDialog from './table-16-delete-dialog';

const Table16Routes = () => (
  <ErrorBoundaryRoutes>
    <Route index element={<Table16 />} />
    <Route path="new" element={<Table16Update />} />
    <Route path=":id">
      <Route index element={<Table16Detail />} />
      <Route path="edit" element={<Table16Update />} />
      <Route path="delete" element={<Table16DeleteDialog />} />
    </Route>
  </ErrorBoundaryRoutes>
);

export default Table16Routes;
