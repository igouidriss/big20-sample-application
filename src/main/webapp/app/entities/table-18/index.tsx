import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table18 from './table-18';
import Table18Detail from './table-18-detail';
import Table18Update from './table-18-update';
import Table18DeleteDialog from './table-18-delete-dialog';

const Table18Routes = () => (
  <ErrorBoundaryRoutes>
    <Route index element={<Table18 />} />
    <Route path="new" element={<Table18Update />} />
    <Route path=":id">
      <Route index element={<Table18Detail />} />
      <Route path="edit" element={<Table18Update />} />
      <Route path="delete" element={<Table18DeleteDialog />} />
    </Route>
  </ErrorBoundaryRoutes>
);

export default Table18Routes;
