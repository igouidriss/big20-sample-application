import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table12 from './table-12';
import Table12Detail from './table-12-detail';
import Table12Update from './table-12-update';
import Table12DeleteDialog from './table-12-delete-dialog';

const Table12Routes = () => (
  <ErrorBoundaryRoutes>
    <Route index element={<Table12 />} />
    <Route path="new" element={<Table12Update />} />
    <Route path=":id">
      <Route index element={<Table12Detail />} />
      <Route path="edit" element={<Table12Update />} />
      <Route path="delete" element={<Table12DeleteDialog />} />
    </Route>
  </ErrorBoundaryRoutes>
);

export default Table12Routes;
